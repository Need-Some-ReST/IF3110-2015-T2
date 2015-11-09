<%-- 
    Document   : index
    Created on : Nov 9, 2015, 5:27:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page = "layout/header.jsp" flush = "true"/>

    <form action="" method="GET" id="searchForm">
        <input type="text" placeholder="Search...">
        <input type="submit" value="Search">
    </form>

    <p class="ask-here">Can't find what you are looking for? <a href="ask.jsp">Ask here</a></p>


    <div class="row">
        <div class="secondary-title col-10 col-push-1">
            <h2>Recently Asked Questions</h2>
        </div>
    </div>
        
    <div class="question-list">
        <div class="inner-container">
            <div class="question">
                <div class="row">
                    <div class="question-status col-3">
                        <div class="question-vote">
                            <div class="status-counts">
                                <span>0</span>
                            </div>
                            <div class="status-title">
                                <span>vote</span>
                            </div>
                        </div>
                        <div class="question-answers">
                            <div class="status-counts">
                                <span>0</span>
                            </div>
                            <div class="status-title">
                                <span>answer</span>
                            </div>
                        </div>
                    </div>
                    <div class="question-summary col-9">
                        <h2 class="question-title">
                            <a href="question.php">iOS periodic background location updates which depends not only on significant location change</a>
                        </h2>
                    </div>
                    <div class="question-meta">
                        <span>
                            Asked by
                            Name |
                            <a href="edit.php" class="question-edit">Edit</a> |
                            <a href="delete.php" class="question-delete">Delete</a>
                        </span>
                    </div>
                </div> <!-- .row -->
            </div> <!-- .question -->
        </div> <!-- .inner-container -->

        <div class="inner-container">
            <div class="question">
                <div class="row">
                    <div class="question-status col-3">
                        <div class="question-vote">
                            <div class="status-counts">
                                <span>0</span>
                            </div>
                            <div class="status-title">
                                <span>vote</span>
                            </div>
                        </div>
                        <div class="question-answers">
                            <div class="status-counts">
                                <span>0</span>
                            </div>
                            <div class="status-title">
                                <span>answer</span>
                            </div>
                        </div>
                    </div> <!-- .question-status -->
                    <div class="question-summary col-9">
                        <h2 class="question-title">
                            <a href="question.php">How to avoid generating empty .deflate files for a Hive query?</a>
                        </h2>
                    </div> <!-- .question-summary -->
                    <div class="question-meta">
                        <span>
                            Asked by
                            Name |
                            <a href="edit.php" class="question-edit">Edit</a> |
                            <a href="" class="question-delete">Delete</a>
                        </span>
                    </div>
                </div> <!-- .row -->
            </div> <!-- .question -->
        </div> <!-- .inner-container -->
    </div> <!-- .question-list -->

<jsp:include page = "layout/footer.jsp" flush = "true"/>