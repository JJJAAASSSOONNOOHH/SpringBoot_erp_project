<div align="center">
	<img src="https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/d6eb5ded-90a7-43a9-ad9d-f8374d3a5a34">
</div>


<div align=center>
	<h3>📚 Tech Stack 📚</h3>
	<p>✨ Platforms & Languages ✨</p>
</div>
<div align=center>
	<img src="https://img.shields.io/badge/Java-ffa500?style=flat&logo=Conda-Forge&logoColor=white" />
	<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=HTML5&logoColor=white" />
	<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=CSS3&logoColor=white" />
	<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=white" />
	<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat&logo=jQuery&logoColor=white" />
	<br>
	<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=Spring&logoColor=white" />
	<img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat&logo=Bootstrap&logoColor=white" />
	<img src="https://img.shields.io/badge/Mybatis-000000?style=flat&logo=Fluentd&logoColor=white" />
	<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white" />
</div>
<br>

<div align=center>
	<p>🛠 Tools 🛠</p>
</div>
<div align=center>
	<img src="https://img.shields.io/badge/IntelliJIDEA%20IDE-2C2255?style=flat&logo=intellijidea&logoColor=white" />
	<br>
	<img src="https://img.shields.io/badge/Tomcat-F8DC75?style=flat&logo=ApacheTomcat&logoColor=white" />
	<img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white" />
</div>
<br>

# 주제 선정 및 기획의도
Spring Boot와 BootStrap을 활용한 ERP 중 편의점 발주 시스템 개발. 본사를 기준으로 지점 - 본사, 본사 - 협력업체 간 발주 생산요청 시스템을 구현함.

일상에서 쉽게 접할 수 있고 대중적인 시스템인 편의점 발주 시스템을 선정했고 수 많은 유통과정을 직관적으로 파악 가능하고『협력사 - 본사 - 지점』로 연결되는 전반적인 시스템을 구성함

# 개발 기간
2023.12.27 ~ 2024.01.31 (5주, 36일)

# 개발 인원 및 역할

<table>
	<tr align=center>
		<th>이한규</th>
		<th>류경현</th>
		<th>노솔진</th>
		<th>조동효</th>
	</tr>
	<tr align=center>
		<td>조장</td>
		<td>상품관리</td>
		<td>메인페이지</td>
		<td>레이아웃</td>
	</tr>
	<tr align=center>
		<td>구매발주(지정 -> 본사)</td>
		<td>조달계획</td>
		<td>지점등록</td>
		<td>재고리스트</td>
	</tr>
	<tr align=center>
		<td></td>
		<td>계약관리(협력업체 <-> 지점)</td>
		<td>협력사 관리</td>
		<td>발주요청목록</td>
	</tr>
	<tr align=center>
		<td></td>
		<td>발표</td>
		<td>요청서</td>
		<td>불출 및 출고처리</td>
	</tr>
	<tr align=center>
		<td></td>
		<td></td>
		<td>입고관리 및 검수 + 반품처리</td>
		<td>PPT</td>
	</tr>
	<tr align=center>
		<td></td>
		<td></td>
		<td>출하내역</td>
		<td></td>
	</tr>
	<tr align=center>
		<td></td>
		<td></td>
		<td>영상촬영</td>
		<td></td>
	</tr>
</table>

# 홈페이지 구조(구성)
<img width="934" alt="image" src="https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/7c67047d-185e-4559-9747-02d373501512">

***

# Flow Chart
<img width="800" alt="image" src="https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/c6a378a1-862f-453b-ae9f-0198015368cd">

***

# ERD
![image](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/03094cca-2953-423d-b4a1-812b095aee4e)

***

# 기능 소개
## :page_with_curl: Main Page
![main](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/ef996cc4-0b47-4a33-ba46-09a92bbbde54)
:point_right: Main Page. 간단히 날짜를 볼 수 있는 달력을 FullCalendar 라이브러리를 이용해서 만듦

:point_right: 현재 지점 수 & 현재 협력사 수는 List의 .size()를 사용

:point_right: 밑에 리스트는 최근에 등록한 5개의 지점 & 협력사

![지점 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/e87d89ae-c361-4314-a6c3-cdb4cd4ca5c9)
:point_right: 지점 등록을 누르면 지점을 등록할 수 있는 페이지로 이동

***

## :page_with_curl: 지점 관리
![지점 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/11a4be80-9e8c-41f8-b790-534c0d2c5082)
:point_right: 지점 목록을 보여주는 페이지

***

## 협력사 관리
### :page_with_curl: 협력사 목록 
![협력사 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/34c86c38-82f1-490a-be3e-0911060051c2)
:point_right: 협력업체들의 목록을 볼 수 있는 페이지

### :page_with_curl: 협력사 등록
![협력사 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/840b3239-49fd-4fdc-a21c-cb989e93c624)
:point_right: 등록하기 버튼을 누르면 직접 협력업체를 등록할 수 있는 페이지로 이동

***

## 계약 관리
### :page_with_curl: 계약 목록
![계약서 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/d7ae70a2-938f-4941-a030-563f9d17e6ee)
:point_right: 협력업체를 등록하면 이제 그에 맞는 계약서를 관리해야 함

### :page_with_curl: 계약 등록
![계약서 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/954ea75e-1908-4a00-87ad-69c1ab6b9c04)
:point_right: 계약서 등록을 눌러서 계약서를 업로드 하고 등록할 수 있음


:point_right: 계약 업체 option을 클릭하면 현재 저장되어 있는 협력업체 table에서 목록을 불러옴


:point_right: 없다면 옆의 버튼으로 추가할 수 있는 페이지로 이동


:point_right: 품목의 경우도 동일

***

## 품목 관리
### :page_with_curl: 품목 목록
![품목 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/0104ff4e-f7b3-4ad1-948d-f83dbdcdd007)

:point_right: 품목 목록을 보여주는 페이지

### :page_with_curl: 품목 등록
![품목 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/9cfccfb1-4159-4c03-a2f5-9e40e975d370)

:point_right: 품목을 등록하는 페이지

![대분류 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/2061c53a-480e-422e-8ae9-019c79c17e76)
![소분류 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/b3f4472b-c715-44ab-914b-f0952702dd68)
![협력사 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/a61b53b9-0b31-4a99-a446-9d43b46429e8)

:point_right: 대분류, 소분류 option에서 직접 선택을 누르면 카테고리들을 추가하고, 아니면 원래 등록되어 있는 카테고리로 품목 등록을 진행함

:point_right: 브랜드 option의 목록들은 협력사들의 목록들을 불러옴

### 📃 품목 상세
![품목 상세](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/a9c2de1f-1a23-4a81-8598-1c220ca9845a)

:point_right: 품목의 상세 정보를 보여주는 페이지. 수정 버튼을 누르면 수정할 수 있고 옆에 해당 품목의 제조업체 + 상품 이미지를 볼 수 있음

### 📃 품목 삭제
![품목 삭제](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/b8ac75f4-608a-4642-a388-999bcab01993)

:point_right: 목록 페이지에서 삭제 버튼을 누르면 Modal이 열리면서 삭제할 것인지 창이 뜨게 함.

***

## 📃 재고 관리 - 재고 리스트
![재고 리스트](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/e8f769c5-18fd-482e-b7ee-ab71207ef71f)

:point_right: 재고 리스트를 클릭하면 현재 품목에 대한 재고가 얼마나 있는지 확인할 수 있음

***

## 발주 요청 (지점 -> 본사)
### 📃 발주 등록

![발주서 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/f1511314-49d1-48ea-b9f8-7ed403a326ed)

:point_right: 발주서를 등록할 수 있는 페이지.

![발주 대분류 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/09882ae6-b6f7-43ec-baa1-3b00aafb95ec)

:point_right: 대분류 option을 클릭하면 현재 본사에 등록된 주 카테고리(대분류)가 보여지게 됨. 여기서 선택하게 되면 ...

![발주 소분류 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/b5690c17-2a79-4ffa-91e4-5aafed1dd7c8)

:point_right: 그 대분류에 맞는 소분류 option 목록이 등장하게 됨. 여기서 소분류를 선택하면 ...

![발주 품목 코드 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/45331d6d-0f15-4a51-b57f-d55d0c22a111)

:point_right: 그 소분류에 맞는 품목 목록 option이 나타나게 됨. 

![발주 지점 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/5fdf19bc-4aa1-4c21-a811-5581a22c8122)

:point_right: 원래는 로그인 된 지점이 자동으로 등록되어야 하지만, 시간 관계상 로그인을 구현을 못해서 자신의 지점을 누르고 선택할 수 있게 구현

### 📃 발주 목록
![발주 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/82c7fb67-b247-4ebe-8c95-b6bb51255e69)

:point_right: 지점별로 어떤 상품을 발주했는지 볼 수 있는 발주목록 페이지.

### 📃 발주 요청 목록
![발주 요청 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/e89afc4b-4b7b-4c2a-941f-10ee5fa417bc)

:point_right: 위에서 발주 등록을 완료하면 자동으로 발주 요청 목록으로 값이 보내지게 설정

![발주 요청 출고 사앹](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/e5ebf114-65b1-4f81-84ba-ab31a3ea9952)

:point_right: 불출하기 버튼을 누르게 되면 어떤 품목을 보내는지 확인 가능. 출고하기 버튼을 누르게 되면 ...

![발주 요청 최종확인](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/a882f119-17af-43a8-bd8a-03dcb27ed764)

:point_right: 이 페이지로 이동해서 최종 확인을 하게 됨. 여기서 확인을 누르면 최종적으로 보내지게 됨

![발주 요청 성공](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/cba22be0-f4b2-4459-aca6-fc88851e1006)

***

## 조달 관리
이제 발주가 등록되었으니 그에 맞는 조달 계획을 작성해야 함

### 📃 조달 계획 등록
![계획 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/593b152e-0105-442a-8aef-5c1f5efb03d7)

:point_right: 조달 계획을 등록할 수 있는 페이지. 품목 option을 누르면 현재 등록된 품목의 목록을 선택할 수 있음

![품목 목록 option](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/144d98ed-e22f-46ca-b6dc-c2c2d1e20301)

:point_right: 품목을 선택하고 '추가'를 누르면 table에 선택한 품목에 맞는 정보가 담기게 됨. 삭제쪽에 있는 x를 누르면 삭제되게 구현

### 📃 조달 계획 목록

![계획 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/ca7aea6b-1991-4211-bd75-40c151e160e6)

:point_right: 현재 등록된 조달 계획의 목록을 보여주는 페이지

### 📃 조달 계획 수정

![계획 수량 수정](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/f8e361ef-b365-4042-935d-733287440d62)

:point_right: 조달 계획 목록에서 수량 수정 버튼을 누르면 수정할 수 있음

### 📃 조달 계획 삭제

![계획 삭제](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/4b247062-767a-438e-8838-e75745475cb7)

:point_right: 조달 계획 목록에서 삭제 버튼을 누르면 1번 더 확인하는 Modal창이 열리고 최종적으로 삭제할 수 있음 

***

## 요청 관리 (본사 -> 협력업체)

### 📃 요청 등록

![요청 등록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/1de9fd0f-ef65-4c2e-ab52-5d0b8cf453ac)

:point_right: 요청 등록을 할 수 있는 페이지. 여기서 품목코드 옆 input 칸을 클릭하게 되면 품목 리스트가 팝업창으로 뜨게 됨

![요청 등록 품목 리스트](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/80d0c6f7-e3eb-4c5c-93f4-7718ccd61284)

:point_right: 품목 목록. 여기서 선택하기 버튼을 누르게 되면...

![요청 등록 자동](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/d1a63869-a2a4-407c-b45e-3da5162553d4)

:point_right: 해당 품목에 해당하는 품목 코드, 브랜드가 자동으로 입력되게 됨. 

:point_right: 등록을 하게 되면 요청 목록에도 추가되고 협력사의 입고 요청 목록에도 동시에 추가되게 구현

### 📃 요청 목록

![요청 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/c29f0c75-c419-4ed3-9aaa-d18f50f2a762)

:point_right: 위에서 등록한 목록을 볼 수 있는 페이지. 상태는 위에서 등록을 하게 되면 자동적으로 완료 상태가 됨. (요청 보내는 게 성공했으므로)

### 📃 요청 명세서

![요청 명세서 보기](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/a772987e-aaf5-4ba9-827e-81d652dc9ba6)

:point_right: 요청 목록에서 명세서 보기를 클릭하는 나오는 페이지. 사실상 상세보기 페이지임.

![요청 명세서 프린트](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/2affdfc0-ab5c-45dd-9466-919822631dbb)

:point_right: print 버튼을 누르면 실제로 프린트 할 수 있는 기능을 구현.

***

## 입고 

### 📃 입고 요청 목록

![입고 요청 목록 리스트](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/501dbef6-2414-4995-9d38-9912bd18e05e)

:point_right: 입고 요청이 등록되면 처음 상태는 미완으로 뜨고 출하 버튼이 보이게 됨. (완료의 경우 보이지 않음)

:point_right: 출하 버튼을 누르면 해당 요청의 정보가 입고 검수 페이지로 보내지게 됨.

### 📃 입고 검수 (본사에서 처리)

![입고 검수 목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/36838149-cba6-4000-a7fd-b0539cc66d6c)

:point_right: 입고 검수 페이지. 검수 완료 & 반품처리 버튼이 있음

:point_right: 검수 완료는 현재 들어온 모든 제품이 정상품이므로 바로 출하시작. 이때 출하 목록으로 해당 정보가 보내짐 + 재고 리스트에 재고 값 증가 처리.

![검수 - 반품 처리](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/0aca91eb-6f63-4d4d-8745-5e56b2281ad3)

:point_right: 반품 처리 클릭 시 Modal로 얼마나 정상품(양품)인지 입력하게 하고, 해당 숫자만큼 출하함

:point_right: Modal로 입력한 수를 뺀 나머지를 다시 입고 요청 목록으로 보내서 다시 입고 받을 수 있도록 함

### 📃 출하

![출하목록](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/0cec94df-abfa-432a-aca1-7a8ec3543ed1)

:point_right: 출하된 물품을 보여주는 리스트. 품목코드, 개수, 날짜, 발주 코드 등을 볼 수 있음. 또한 명세서도 볼 수 있음

*** 

## 검색기능

![검색 화면](https://github.com/JJJAAASSSOONNOOHH/SpringBoot_erp_project/assets/93170784/ca44e21c-13f9-4b2a-82d5-fb7f4c01caf5)

👉 검색하려는 type, keyword를 치게 만들어서 해당 정보만 나오게 함

👉 type, keyword가 존재하면 CRUD 수행 시 해당 정보가 포함된 페이지가 나오도록 구현

***

# ⭐후기
이한규 👉 생소하고 어려웠지만 알아갈 수 있었고 재미있었다.

류경현 👉 Gradle을 통해 다양한 기능들을 구현할 수 있어 좋았다.

노솔진 👉 예전에는 간단한 CRUD만 사용했다면 이제는 추가적인 기능 (2개 이상의 Entity에 동시에 등록되게 하기 등)을 설계하고 구현할 수 있어서 좋았다.

조동효 👉 막히는 부분에서 너무 많은 시간을 소비해서 처음 생각했던 기능을 전부 구현하지 못했지만 재미있었고 뜻깊은 시간이었다.
