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

public class President {
    protected String name;
    protected String birth_location;
    protected String birthday;

    public President() {
        this("", "", "");
    }

    protected President(String name, String birth_location, String birthday) {
        this.name = name;
        this.birth_location = birth_location;
        this.birthday = birthday;

    }

    public String getName() {
        return name;
    }

    public String getBirth_location() {
        return birth_location;
    }
    public void setBirth_location(String birth_location) {
        this.birth_location = birth_location;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (name != null && !name.isEmpty()) {
            builder.append(name);
            builder.append(" (");

            if (birth_location != null && !birth_location.isEmpty()) {
                if (0 < builder.length() && '(' != builder.charAt(builder.length() - 1)) {
                    builder.append(", ");
                }
                builder.append("Birth_location: ");
                builder.append(birth_location);
            }

            if (birthday != null && !birthday.isEmpty()) {
                if (0 < builder.length() && '(' != builder.charAt(builder.length() - 1)) {
                    builder.append(", ");
                }
                builder.append("Birthday: ");
                builder.append(birthday);
            }

            builder.append(")");
        }
        return builder.toString();
    }
}