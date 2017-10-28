package cn.ccc.mydubbo.service.impl;
import org.springframework.stereotype.Service;

import cn.ccc.mydubbo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo(String str) {
		return "【ECHO】" + str;
	}

}