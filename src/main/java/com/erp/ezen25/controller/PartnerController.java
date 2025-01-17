package com.erp.ezen25.controller;

import com.erp.ezen25.dto.BrandDTO;
import com.erp.ezen25.dto.PageRequestDTO;
import com.erp.ezen25.dto.contractDTOs.*;
import com.erp.ezen25.dto.productDTOs.ProductBnameListResponseDTO;
import com.erp.ezen25.service.BrandService;
import com.erp.ezen25.service.ContractService;
import com.erp.ezen25.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/ezen25/brand/*")
@Log4j2
@RequiredArgsConstructor
// 협력업체 관련 Controller
public class PartnerController {

    private final BrandService brandService;

    private final ContractService contractService;

    private final MemberService memberService;

    @GetMapping("/memberList")
    public void memberList(PageRequestDTO pageRequestDTO, Model model) {
        model.addAttribute("memberResult", memberService.getList(pageRequestDTO));
    }

    @GetMapping("/")
    public String brandHome() {
        return "redirect:/ezen25/brand/list";
    }

    @GetMapping("/list")
    public void brandList(PageRequestDTO pageRequestDTO, Model model) {

        log.info("brandList. ");
        log.info(pageRequestDTO);

        model.addAttribute("brandResult", brandService.getList(pageRequestDTO));
    }

    @GetMapping("/register")
    public void brandRegister() {
        log.info("GET 형식 Register");
    }

    @PostMapping("/register")
    public String brandPOSTRegister(BrandDTO brandDTO) {
        log.info("POST 형식 Register");

        Long brandId = brandService.register(brandDTO);

        return "redirect:/ezen25/brand/list";

    }

    @GetMapping({"/read", "/modify", "/print"})
    public void brandRead(@RequestParam("brandId") Long brandId, @ModelAttribute("pageRequestDTO") PageRequestDTO pageRequestDTO, Model model) {
        log.info("Get Read/Modify. gno : " + brandId);

        BrandDTO dto = brandService.read(brandId);

        model.addAttribute("dto", dto);
    }

    @PostMapping("/remove")
    public String brandRemove(@RequestParam("brandId") Long brandId, RedirectAttributes redirectAttributes) {
        log.info("Post Remove. brandId : " + brandId);

        brandService.remove(brandId);

        redirectAttributes.addFlashAttribute("msg", brandId);

        return "redirect:/ezen25/brand/list";
    }

    @PostMapping("/modify")
    public String brandModify(BrandDTO brandDTO, @ModelAttribute("pageRequestDTO") PageRequestDTO pageRequestDTO,
                         RedirectAttributes redirectAttributes) {
        log.info("Post Modify. brandDTO : " + brandDTO);

        brandService.modify(brandDTO);

        redirectAttributes.addAttribute("page", pageRequestDTO.getPage());
        redirectAttributes.addAttribute("type", pageRequestDTO.getType());
        redirectAttributes.addAttribute("keyword", pageRequestDTO.getKeyword());
        redirectAttributes.addAttribute("brandId", brandDTO.getBrandId());

        return "redirect:/ezen25/brand/read";
    }

    // 계약관리 -----------
    @GetMapping("/contract/contractList")
    public void contractList (Model model) {
        List<ContractListResponseDTO> cList = contractService.contractList();

        model.addAttribute("cList", cList);
    }

    @GetMapping(value = {"/contract/contractList{date1}~{date2}"})
    public String contractListByDate(@PathVariable(value = "date1", required = false) LocalDate date1, @PathVariable(value = "date2",required = false) LocalDate date2, Model model) {
        List<ContractListResponseDTO> cList = contractService.getContractListByDate(date1, date2);
        model.addAttribute("cList", cList);
        return "/ezen25/brand/contract/contractList";
    }
    @GetMapping("/contract/contractAdd")
    public void contractAddForm (Model model) {
        List<ProductBnameListResponseDTO> bList = contractService.bnameList();
        List<ContractPnameListResponseDTO> pList = contractService.prodList();

        model.addAttribute("bList",bList);
        model.addAttribute("pList",pList);
    }

    @PostMapping("/contract/contractAdd")
    public String contractAdd (ContractAddRequestDTO addRequest, @RequestParam("contractSelect") MultipartFile mf) throws IOException {
        contractService.addContract(addRequest, mf);
        return "redirect:/ezen25/brand/contract/contractList";
    }

    @PostMapping("/contract/contractDelete")
    @ResponseBody
    public ResponseEntity<Void> contractDelete (@RequestParam("contractId") Long contractId) {
        contractService.contractDelete(contractId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/contract/contractModify/{contractId}")
    public String contractModifyForm(@PathVariable("contractId") Long contractId, Model model) {
        List<ProductBnameListResponseDTO> bList = contractService.bnameList();
        List<ContractPnameListResponseDTO> pList = contractService.prodList();
        ContractDetailResponseDTO contract = contractService.contractDetail(contractId);

        model.addAttribute("bList",bList);
        model.addAttribute("pList",pList);
        model.addAttribute("contract",contract);

        return "/ezen25/brand/contract/contractModify";
    }
    @PostMapping("/contract/contractModify/{contractid}")
    public String contractModify(ContractModifyRequest updateRequest, @RequestParam("contractSelect") MultipartFile mf) throws IOException {
        contractService.contractUpdate(updateRequest, mf);
        return "redirect:/ezen25/brand/contract/contractList";
    }
}
