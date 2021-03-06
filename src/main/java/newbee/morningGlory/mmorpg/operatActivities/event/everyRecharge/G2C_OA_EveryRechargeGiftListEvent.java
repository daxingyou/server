/**
 *   Copyright 2013-2015 Sophia
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
*/
package newbee.morningGlory.mmorpg.operatActivities.event.everyRecharge;

import java.util.ArrayList;
import java.util.List;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;
import sophia.mmorpg.player.itemBag.ItemPair;

public class G2C_OA_EveryRechargeGiftListEvent extends ActionEventBase {
	private byte status;
	private int worth = 0;
	private List<ItemPair> items = new ArrayList<ItemPair>();
	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		buffer.put(status);
		buffer.putInt(worth);
		//buffer.putShort((short) items.size());
		buffer.put((byte) items.size());
		for (ItemPair itemPair : items) {
			putString(buffer, itemPair.getItemRefId());
			buffer.putInt(itemPair.getNumber());
			buffer.put((byte) (itemPair.isBindStatus() ? 1 : 0));
		}
		return buffer;
	}
	
	@Override
	public void unpackBody(IoBuffer buffer) {
		
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getWorth() {
		return worth;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	public List<ItemPair> getItems() {
		return items;
	}

	public void setItems(List<ItemPair> items) {
		this.items = items;
	}
	
}
