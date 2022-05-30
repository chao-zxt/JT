package org.zxt.jt.netty.config;

import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author chao
 * @title: org.zxt.jt.netty.config
 * @description: todo
 * @date 2022/5/30 20:21
 */
public class NettyConfig {
    protected int port;
    protected int maxFrameLength;
    protected LengthField lengthField;
    protected Delimiter[] delimiter;
    protected MessageDecoder decoder;
    protected MessageEncoder encoder;
    protected HandlerMapping handlerMapping;
    protected HandlerInterceptor handlerInterceptor;
    protected SessionManager sessionManager;
    protected SessionListener sessionListener;
    protected ChannelInboundHandlerAdapter adapter;
}
