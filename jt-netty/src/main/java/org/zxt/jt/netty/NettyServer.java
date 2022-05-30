package org.zxt.jt.netty;

import io.netty.channel.EventLoopGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chao
 * @title: org.zxt.jt.netty
 * @description: todo
 * @date 2022/5/30 20:07
 */
public class NettyServer {
    private static final Logger log = LoggerFactory.getLogger(NettyServer.class);

    /**
     * 运行状态
     */
    private final boolean running = false;
    private final EventLoopGroup bossGroup = null;
    private final EventLoopGroup workerGroup = null;
    private String name;
}
