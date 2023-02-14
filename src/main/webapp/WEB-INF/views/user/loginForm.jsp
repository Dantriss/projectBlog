<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8" %>

<%@include file="../layout/header.jsp" %>

<div class="container">

        <form action="/action_page.php">
            <div class="form-group">
                <label for="user_id">ID</label>
                <input type="text" class="form-control" id="user_id" placeholder="Enter ID" name="user_id">
            </div>
            <div class="form-group">
                <label for="pwd">Password</label>
                <input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="password">
            </div>

            <div class="form-group form-check">
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox" name="remember"> Remember me
                </label>
            </div>

            <button type="submit" class="btn btn-primary">로그인</button>
        </form>
    </div>



<%@include file="../layout/footer.jsp" %>

