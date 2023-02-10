        <%@ include file="common/header.jspf" %>

        <%@ include file="common/navigation.jspf" %>

        <div class="container">
            <h1>Enter Todo Details</h1>
            <form:form action="" method="post" modelAttribute="todo">

                <fieldset class="mb-3">
                    <form:label path="description">Description: </form:label>
                    <form:input type="text" path="description" id="description" required="required" />
                    <form:errors path="description" cssClass="text-warning" />
                </fieldset>

                <fieldset class="mb-3">
                    <form:label path="targetDate">Target Date: </form:label>
                    <form:input type="text" path="targetDate" id="targetDate" required="required" />
                    <form:errors path="targetDate" cssClass="text-warning" />
                </fieldset>





                <form:input type="hidden" path="id" id="description" required="required" />
                <form:input type="hidden" path="done" id="description" required="required" />
                <br />
                <input type="submit" value="submit" class="btn btn-success">
            </form:form>
        </div>


   <%@ include file="common/footer.jspf" %>

   <script type="text/javascript" >
                                     $('#targetDate').datepicker({
                                         format: 'yyyy-mm-dd',
                                     });
                                 </script>
