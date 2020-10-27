/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.usjt.firewallsimples.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.Service;
import org.onosproject.core.ApplicationId;
import org.onosproject.core.CoreService;
import org.onosproject.net.device.DeviceService;
import org.onosproject.net.flow.FlowRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.HashMultimap;

import proactive.firewall.app.ProactiveFirewall.BlockRecord;


@Component(immediate = true)
@Service
public class ProactiveFirewall implements FirewallService{

	private static Logger log = LoggerFactory.getLogger(ProactiveFirewall.class);

    private static final int DROP_PRIORITY = 129;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected CoreService coreService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected FlowRuleService flowRuleService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected DeviceService deviceService;

    private ApplicationId appId;
    
    private final HashSet<BlockRecord> srcBlockList = new HashSet<>();
    private final HashSet<BlockRecord> dstBlockList = new HashSet<>();

    private final HashMultimap<BlockRecord,BlockRecord> pairBlockList = HashMultimap.create();

  
	@Override
	public ArrayList<String> listAllRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fwAddSrcRule(String srcIp, String srcPort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwAddDstRule(String dstIp, String dstPort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwAddPairRule(String srcFlow, String dstFlow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwRemoveSrcRule(String srcIp, String srcPort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwRemoveDstRule(String dstIp, String dstPort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwRemovePairRule(String srcFlow, String dstFlow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fwRemoveAllRule() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	private class BlockRecord {
        private  String ip;
        private  String port;

        BlockRecord(String ip, String port) {
            this.ip = ip;
            this.port = port;
        }

        BlockRecord() {
            this.ip = null;
            this.port = null;
        }

        BlockRecord(String ip) {
            this.ip = ip;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ip, port);
        }

        @Override
        public String toString() {

            String record = this.ip;
            boolean noSrcPort  = this.port == null;
            if (!noSrcPort) {
                return record.concat(":").concat(this.port);
            }
            else return record;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final BlockRecord other = (BlockRecord) obj;
            return Objects.equals(this.ip, other.ip) && Objects.equals(this.port, other.port);
        }
    }
	
	
}