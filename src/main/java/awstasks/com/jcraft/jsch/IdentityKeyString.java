/**
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package awstasks.com.jcraft.jsch;

public class IdentityKeyString {

    public static Identity newInstance(String keyFileContent, JSch jSch) throws JSchException {
        IdentityFile identityFile = IdentityFile.newInstance("keyFileContent-" + keyFileContent.hashCode(), keyFileContent.getBytes(), null, jSch);
        return identityFile;
    }
}
