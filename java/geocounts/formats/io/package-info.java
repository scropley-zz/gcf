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

/**
 * To decode:<br />
 * 
 * <pre>
 * import java.io.File;
 * import geocounts.traffic.formats.RawTrafficData;
 * import geocounts.formats.io.RawTrafficDataFileTXTDecoder;
 * 
 * 
 * File theInputFile = new File("path to your GC file.txt");
 * RawTrafficData rawdata = RawTrafficDataFileTXTDecoder.loadFromFile(theFile, true);
 * </pre>
 * 
 * To encode:<br />
 * 
 * <pre>
 * import java.io.File;
 * import geocounts.traffic.formats.RawTrafficData;
 * import geocounts.formats.io.RawTrafficDataFileTXTEncoder;
 * 
 * 
 * File theOutputFile = new File("path to your GC file.txt");
 * RawTrafficDataFileTXTEncoder.writeData(theOutputFile, rawdata);
 * 
 * </pre>
 */
package geocounts.formats.io;