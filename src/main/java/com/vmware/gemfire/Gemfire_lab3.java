/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vmware.gemfire;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;

import java.util.HashSet;
import java.util.Set;

public class Gemfire_lab3 {
    public static final String JAMESMADISON = "JamesMadison";
    public static final String JAMESMONROE = "JamesMonroe";
    public static final String JONEQUINCYADAMS = "JohnQuincyAdams";
    public static final String ANDEWJACKSON = "AndewJackson";
    public static final String MARTINVANBUREN = "MartinVanBuren";
    public static final String WILLIAMHENRYHARRISON = "WilliamHenryHarrison";
    public static final String JOHNTYLER = "JohnTyler";
    final Region<String, President> region;

    public Gemfire_lab3(Region<String, President> region) {
        this.region = region;
    }

    public static void main(String[] args) {
        // connect to the locator using default port 10334
        ClientCache cache = new ClientCacheFactory().addPoolLocator("172.16.200.227", 10334)
                .set("log-level", "WARN")
                .setPdxSerializer(
                        new ReflectionBasedAutoSerializer("com.vmware.gemfire.President"))
                .create();

        // create a local region that matches the server region
        Region<String, President> region =
                cache.<String, President>createClientRegionFactory(ClientRegionShortcut.PROXY)
                        .create("example-region");

        Gemfire_lab3 example = new Gemfire_lab3(region);
        example.insertValues();
        example.printValues(example.getKeys());

        cache.close();
    }

    President create(String name) {
        return create(name, name + " City");
    }
    President create(String name, String birth_location) {
        return create(name, birth_location, "");
    }
    President create(String name, String birth_location, String birthday) {
        return new President(name, birth_location, birthday);
    }


    Set<String> getKeys() {
        return new HashSet<>(region.keySetOnServer());
    }

    void insertValues() {
        insertValue(create(JAMESMADISON, "Godam City", "20240101"));
        insertValue(create(JAMESMONROE, "Seoul", "20230101"));
        insertValue(create(JONEQUINCYADAMS, "tokyo", "20210101"));
        insertValue(create(ANDEWJACKSON));
        insertValue(create(MARTINVANBUREN));
        insertValue(create(WILLIAMHENRYHARRISON, "Edelweiss","20180101"));
        insertValue(create(JOHNTYLER, "beijing", "20190101"));
    }
    void insertValue(President president) { region.put(president.getName(), president); }

    void printValues(Set<String> keys) {
        for (String key : keys) {
            President president = region.get(key);
            System.out.println(key + ": " + president);
        }
    }
}