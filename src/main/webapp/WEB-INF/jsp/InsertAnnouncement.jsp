<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .card{
            width: 90%;
            background: whitesmoke;
            padding: 10px;
            margin: auto;
        }
        .float-left{
            float: left;
        }
        .float-right{
            float: right;
        }
        .p-10{
            padding: 10px;
        }
        .h-50p{
            height: 50px;
        }
        .mr-1{
            margin-right: 1em;
        }
        .mr-2{
            margin-right: 2em;
        }
        .mr-3{
            margin-right: 3em;
        }
        .mr-4{
            margin-right: 4em;
        }
        .mr-5{
            margin-right: 5em;
        }
    </style>
</head>
<body>
    <div class="card">
        <form name="insertForm" action="/announcement/insert" method="post">
            <div class="p-10">
                <label>제목</label>
                <div>
                    <input name="name" type="text" value="[월간 카카오 8월]"/>
                </div>
            </div>
            <hr>
            <div class="p-10">
                <label>분류</label>
                <div>
                    <select name="sectors">
                        <option value="TECH">테크</option>
                        <option value="SERVICE">서비스</option>
                        <option value="BRAND">브랜드</option>
                        <option value="STAFF">스태프</option>
                    </select>
                </div>
            </div>
            <hr>
            <div class="p-10 h-50p">
                <div class="float-left mr-1">
                    <label>회사</label>
                    <div>
                        <input name="company" type="text" value="카카오"/>
                    </div>
                </div>
                <div class="float-left mr-1">
                    <label>영입 형태</label>
                    <div>
                        <select name="recruitType">
                            <option value="TEMPORARY">비정규직</option>
                            <option value="PERMANENT">정규직</option>
                            <option value="CONTRACT">계약직</option>
                        </select>
                    </div>
                </div>
                <div class="float-left mr-1">
                    <label>종료일</label>
                    <div>
                        <input name="dueDate" type="date" value="영입시 종료"/>
                    </div>
                </div>
                <div class="float-left mr-1">
                    <label>위치</label>
                    <div>
                        <input name="location" type="text" value="판교"/>
                    </div>
                </div>
            </div>
            <hr>
            <div class="p-10">
                <label>이미지</label>
                <div>
                    <input type="text" value="이미지"/>
                </div>
            </div>
            <hr>    
            <div class="p-10">
                <label>상세</label>
                <div>
                    <textarea>
                        상세
                    </textarea>
                </div>
                <input type="hidden" name="content">
            </div>
            <hr>
            <div class="p-10">
                <label>예약</label>
                <div>
                    <input name="reservationDt" type="date" />
                </div>
            </div>
            <hr>
            <div class="p-10">
                <label>태그</label>
                <div>
                    <input name="keyword" type="text" value="#Android #iOS"/>
                </div>
            </div>
            <hr>
            <div class="p-10 mr-2 h-50p">
                <div class="float-right">
                    <button>취소</button>
                    <button>작성</button>
                </div>
            </div>
        </form>
    </div>
</body>
<script>
    document.insertForm.reservationDt.value= new Date().toISOString().substring(0, 10);
</script>
</html>