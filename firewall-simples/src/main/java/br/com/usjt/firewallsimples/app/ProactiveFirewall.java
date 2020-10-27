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
}