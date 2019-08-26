package io.github.hylexus.jt808.handler.impl;

import com.google.common.collect.Sets;
import io.github.hylexus.jt808.handler.AbstractMsgHandler;
import io.github.hylexus.jt808.msg.AbstractRequestMsg;
import io.github.hylexus.jt808.msg.BuiltinMsgType;
import io.github.hylexus.jt808.msg.RespMsgBody;
import io.github.hylexus.jt808.session.Session;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static java.util.Optional.of;

/**
 * @author hylexus
 * Created At 2019-08-26 8:46 下午
 */
@Slf4j
public class HeartBeatMsgHandler extends AbstractMsgHandler {

    public HeartBeatMsgHandler() {
        super(Sets.newHashSet(BuiltinMsgType.CLIENT_HEART_BEAT));
    }

    @Override
    protected Optional<RespMsgBody> doProcess(AbstractRequestMsg msg, Session session) {

        log.debug("client heart beat, terminalId = {}", msg.getHeader().getTerminalId());

        return of(commonReply(msg, BuiltinMsgType.CLIENT_HEART_BEAT));
    }
}