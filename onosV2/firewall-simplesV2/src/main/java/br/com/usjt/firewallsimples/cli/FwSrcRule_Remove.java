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
package br.com.usjt.firewallsimples.cli;

import org.apache.karaf.shell.commands.Command;
import br.com.usjt.firewallsimples.app.FirewallService;
import org.onosproject.cli.AbstractShellCommand;
import org.apache.karaf.shell.commands.Argument;
@Command(scope = "proactiveFirewall", name = "fwRemove-srcRule", description = "Remove Regra de Bloqueio para a origem especificada - IP/[PORTA]")
public class FwSrcRule_Remove extends AbstractShellCommand{
	@Argument(index = 0, name = "srcIp", description = "Ip de Origem do Bloqueio",
            required = true, multiValued = false)
    String srcIp = null;

    @Argument(index = 1, name = "srcPort", description = "Porta a ser bloqueada [opcional]",
            required = false, multiValued = false)
    String srcPort = null;
    
	@Override
	protected void doExecute() {
		FirewallService firewallService = get(FirewallService.class);
        firewallService.fwRemoveSrcRule(srcIp, srcPort);
        print("Bloqueio removido com sucesso para o origem %s - A porta informada foi %s [null representa todas as portas]", srcIp, srcPort);
        print("Para listar as regras existentes, por favor execute o comando fwlist-allrules");
	}

}
