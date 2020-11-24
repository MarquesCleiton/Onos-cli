/*
 * Copyright 2015 Open Networking Laboratory
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

import java.util.Objects;

public class BlockRecord {
	public String ip;
    public String port;

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
