package net.daum.controller;

public interface Action {
    public abstract ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
