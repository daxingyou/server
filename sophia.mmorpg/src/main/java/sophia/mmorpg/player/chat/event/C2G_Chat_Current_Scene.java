package sophia.mmorpg.player.chat.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

public class C2G_Chat_Current_Scene extends ActionEventBase {
	private String msg;

	@Override
	public void unpackBody(IoBuffer buffer) {
		this.msg = getString(buffer);
	}

	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		putString(buffer, msg);
		return buffer;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public String getName(){
		return "当前";
	}
}
