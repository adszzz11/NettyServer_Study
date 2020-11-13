package DiscardServer;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

class DiscardSeverHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext arg0, Object arg1) throws Exception {
        //main() 에서 클라이언트가 데이터를 전송되면 자동으로 실행되는 메소드

        //현재 아무것도 하지 않음
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}