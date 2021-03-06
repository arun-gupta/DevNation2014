package org.jboss.devnation.iotbof.events;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.xml.bind.annotation.XmlElement;

/**
 * @author Scott Stark (sstark@redhat.com) (C) 2014 Red Hat Inc.
 */
public class NspResource {
   private String path;
   private String iface;
   private String ct;
   private String obs;
   private String rt;

   public String getPath() {
      return path;
   }

   public void setPath(String path) {
      this.path = path;
   }

   @XmlElement(name = "if")
   public String getIface() {
      return iface;
   }

   public void setIface(String iface) {
      this.iface = iface;
   }

   public String getCt() {
      return ct;
   }

   public void setCt(String ct) {
      this.ct = ct;
   }

   public String getObs() {
      return obs;
   }

   public void setObs(String obs) {
      this.obs = obs;
   }

   public String getRt() {
      return rt;
   }

   public void setRt(String rt) {
      this.rt = rt;
   }

@Override
public String toString() {
	return "NspResource [path=" + path + ", iface=" + iface + ", ct=" + ct
			+ ", obs=" + obs + ", rt=" + rt + "]";
}

   public boolean isObservable() {
      return Boolean.valueOf(obs);
   }
}
