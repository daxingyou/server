package sophia.mmorpg.player.itemBag.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

public class C2G_Item_SoltUnLock extends ActionEventBase {
	
	private short index;
	
	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		
		return null;
	}

	@Override
	public void unpackBody(IoBuffer buffer) {
		index = buffer.getShort();

	}

	public short getIndex() {
		return index;
	}

	public void setIndex(short index) {
		this.index = index;
	}

	

}
