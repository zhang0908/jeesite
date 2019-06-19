<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>设置模块标识</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#name").focus();
			$("#inputForm").validate({
			});
		});
	</script>
</head>
<body>
	<form:form id="inputForm" modelAttribute="modelInfo" action="${ctx}/tusermng/setModuleName" method="post" class="form-horizontal">
		<div class="control-group">
		<BR><BR><BR><BR><BR><BR>
			<label class="control-label">模块名称(唯一标识):</label>
			<div class="controls">
				<form:input path="moduleName" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="确定"/>
		</div>
	</form:form>
</body>
</html>