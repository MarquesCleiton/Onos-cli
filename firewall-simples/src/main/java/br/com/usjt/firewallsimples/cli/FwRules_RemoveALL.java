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

@Command(scope = "proactiveFirewall", name = "fwremove-AllRules", description = "Remove todas as regras criadas pelo firewall")
public class FwRules_RemoveALL extends AbstractShellCommand {

	@Override
	protected void execute() {
		FirewallService firewallService = get(FirewallService.class);
		/*
		 * TODO Lab 1: Manipulando Comandos (Remover todas as Regras)
		 *
		 * Nao ha misterios nesse comando. Devemos apenas realizar uma chamada à
		 * função fwRemoveAllRule() implementada em nossa classe principal
		 * (ProactiveFirewall.java, linha 202). Após chamar a função de remoção das
		 * regras, vá ate a linha mencionada para implementar a funcionamento do
		 * comando.
		 */
		firewallService.fwRemoveAllRule();
		print("Todas as regras do Firewall foram removidas. Nao ha bloqueios ativos.");
	}

}
