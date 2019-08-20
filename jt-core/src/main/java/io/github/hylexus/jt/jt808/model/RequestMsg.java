package io.github.hylexus.jt.jt808.model;

/**
 * @author hylexus
 * Created At 2019-08-20 22:01
 */
public interface RequestMsg {
    RequestMsgHeader getHeader();

    byte[] getBodyBytes();

    byte getCheckSum();

    MsgType getMsgType();

}
