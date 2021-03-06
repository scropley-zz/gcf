/*
 * Licensed to Transmetric America Inc (TAI) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * TAI licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * <a href="http://geocounts.com">geocounts.com</a>
 */
package geocounts.formats.units;

public interface UnitConverter {
  public String getId();
  
  /**
   * Converts to {@link geocounts.traffic.formats.UnitsUsed.SystemOfUnits#metric metric} units
   * @param nativeValue A native value
   * @return A {@link geocounts.traffic.formats.UnitsUsed.SystemOfUnits#metric metric} value
   */
  public double toMetric(double nativeValue);
  /**
   * Converts to native units
   * @param metricValue
   * @return A native value
   */
  public double toNative(double metricValue);
  
  /**
   * @param id
   * @return True if the id matches this value
   */
  public boolean matches(String id);
}