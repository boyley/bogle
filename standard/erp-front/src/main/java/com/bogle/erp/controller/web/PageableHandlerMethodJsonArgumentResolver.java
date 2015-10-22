package com.bogle.erp.controller.web;

import org.springframework.core.MethodParameter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by 赵波 on 2015/10/22.
 */
public class PageableHandlerMethodJsonArgumentResolver extends PageableHandlerMethodArgumentResolver {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private Charset charset = DEFAULT_CHARSET;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return super.supportsParameter(parameter);
    }

    @Override
    public Pageable resolveArgument(MethodParameter methodParameter, ModelAndViewContainer mavContainer,
                                    NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        ServletServerHttpRequest inputMessage = this.createInputMessage(webRequest);
        MediaType contentType = inputMessage.getHeaders().getContentType();
        Charset charset = (contentType.getCharSet() != null ? contentType.getCharSet() : this.charset);

        try {
            byte[] bytes = StreamUtils.copyToByteArray(inputMessage.getBody());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    protected ServletServerHttpRequest createInputMessage(NativeWebRequest webRequest) {
        HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
        return new ServletServerHttpRequest(servletRequest);
    }
}
