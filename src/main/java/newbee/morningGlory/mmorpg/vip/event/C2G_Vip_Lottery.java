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
package newbee.morningGlory.mmorpg.vip.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

public class C2G_Vip_Lottery extends ActionEventBase {
	private byte lotteryType = 0;
	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void unpackBody(IoBuffer buffer) {
		lotteryType = buffer.get();
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "vip抽奖 ";
	}
	public byte getLotteryType() {
		return lotteryType;
	}
	public void setLotteryType(byte lotteryType) {
		this.lotteryType = lotteryType;
	}
	
}
