/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.apache.avro.repo;

/**
 * A {@link Repository} is a collection of {@link Subject}s. A {@link Subject}
 * can be looked up by name on a {@link Repository}, or registered.
 * 
 */
public interface Repository {

  /**
   * Attempt to create a Subject with the given name and validator.
   * 
   * @param subjectName
   *          The name of the subject. Must not be null.
   * @param validator
   *          the identifier for the validator. May be null.
   * @return The newly created Subject, or an equivalent one if already created.
   *         Does not return null.
   * @throws NullPointerException
   *           if subjectName is null
   */
  Subject register(String subjectName, String validator);

  /**
   * Returns the subject if it exists, null otherwise.
   * 
   * @param subject
   *          the subject name
   * @return The subject if it exists, null otherwise.
   */
  Subject lookup(String subjectName);

  /**
   * List all subjects. Does not return null.
   */
  Iterable<Subject> subjects();

}
