<%--
  Created by IntelliJ IDEA.
  User: Zamuna
  Date: 8/7/2017
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<form class="form-horizontal" action="/addCast">
    <div class="form-group">
        <label for="inputActor" class="col-sm-2 control-label">Actor Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputActor" placeholder="Actor Name">
        </div>
    </div>
    <div class="form-group">
        <label for="inputRole" class="col-sm-2 control-label">Role</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputRole" placeholder="Role">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Save</button>
        </div>
    </div>
</form>
<%@include file="footer.jsp"%>
