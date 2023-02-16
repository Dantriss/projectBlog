<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8" %>

<%@include file="../layout/header.jsp" %>

<div class="container">

        <form action="/user/join">
            <div class="form-group">
                <label for="user_id">ID</label>
                <input type="text" class="form-control" id="user_id" placeholder="Enter ID" name="user_id">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
            </div>

        </form>

    <button id="btn-save" class="btn btn-primary">회원가입완료</button>

    </div>
<script src="/blog/js/user.js"></script>


<%@include file="../layout/footer.jsp" %>

