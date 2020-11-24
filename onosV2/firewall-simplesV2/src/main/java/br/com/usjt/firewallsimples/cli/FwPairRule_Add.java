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
import org.onosproject.cli.AbstractShellCommand;

import br.com.usjt.firewallsimples.app.FirewallService;

import org.apache.karaf.shell.commands.Argument;

@Command(scope = "proactiveFirewall", name = "fwAdd-pairRule", description = "Adicione Regra de Bloqueio para o par de IPS especificados no formato IP:[PORTA]")
public class FwPairRule_Add extends AbstractShellCommand{

	@Argument(index = 0, name = "srcIpPort", description = "Ip:[Porta] de Origem do bloqueio",
            required = true, multiValued = false)
    String srcIp = null;

    @Argument(index = 1, name = "dstIpPort", description = "Ip:[Porta] de Destino do bloqueio",
            required = true, multiValued = false)
    String dstIp = null;
    
	@Override
	protected void doExecute() {
		FirewallService firewallService = get(FirewallService.class);
        firewallService.fwAddPairRule(srcIp, dstIp);
        print("Bloqueio criado com sucesso para o par de ips - %s <--> %s", srcIp, dstIp);
        print("Para listar as regras existentes, por favor execute o comando fwlist-allrules");
	}

}
