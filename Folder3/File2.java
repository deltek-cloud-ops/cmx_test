public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String content = request.getParameter("some_param");
      // 
      // .... some code goes here
      //
      response.getWriter().print(content);
}