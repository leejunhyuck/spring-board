<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="../includes/header.jsp" %>

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-4 text-gray-800">Board Modify/Delete Page</h1>
          
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Modify/Delete</h6>
            </div>
            <div class="card-body">
            
            <form id='form1' >
            <div class="form-group ">
                    <input name="bno" type="text" class="form-control form-control-user"  placeholder="Title"
                    value='<c:out value="${vo.bno }"/>' >
                </div>
           
                <div class="form-group ">
                    <input name="title" type="text" class="form-control form-control-user"  placeholder="Title"
                    value='<c:out value="${vo.title }"/>' >
                </div>
                <div class="form-group">
                  <input type="text" class="form-control form-control-user" name="content" placeholder="Content"
                   value='<c:out value="${vo.content }"/>' >
                </div>
                <div class="form-group ">
               
                    <input type="text" class="form-control form-control-user" name="writer" placeholder="Writer"
                    value='<c:out value="${vo.writer}"/>' >
                  </div>
              
                </form>
                
                
                <button class="btn btn-warning" >
                modify</button>
                
                <button class="btn btn-danger" >
                delete</button>
                
                
                <hr>
        
              
           		<a href="/board/list" class="btn btn-secondary">
                  Go to List
                </a>
                </div>
            </div>
        </div>
        <!-- /.container-fluid -->
        
 
 <script>
 
 	 $('.btn-danger').on("click",function(){
	  
	  console.log("클릭");
	  
	  var formObj = $("#form1");
	  
	  formObj.attr("action","/board/remove")
	  .attr("method","post")
	  .submit();
  });
 
 	 
	$('.btn-warning').on("click",function(){
	  
	  console.log("modify 클릭");
	  
	  var formObj = $("#form1");
	  
	  formObj.attr("action","/board/modify")
	  .attr("method","post")
	  .submit();
  });
 
 
 
 
 
 
 
 
 var flag = '${result}';
 
 if(flag === 'success'){
	 alert("작업이 성공했습니다.");
 }
 
 
 </script>
         
<%@include file="../includes/footer.jsp" %>


 
 
</body>
</html>