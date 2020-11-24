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

import java.util.ArrayList;

import org.apache.karaf.shell.commands.Argument;

@Command(scope = "proactiveFirewall", name = "fwList-AllRules", description = "Listar as regras existentes em nosso firewall")
public class FwRules_List extends AbstractShellCommand {

	@Override
	protected void doExecute() {
		FirewallService firewallService = get(FirewallService.class);

		ArrayList<String> list = firewallService.listAllRules();

		print("Listando %s regras: ", list.size());
		print("--------------------------------------------");
		for (String rule : list) {
			print(rule);
		}
		print("--------------------------------------------");
	}

}
