/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.sysds.test.component.compress.offset;

import static org.junit.Assert.assertEquals;

import org.apache.sysds.runtime.compress.colgroup.offset.AOffset;
import org.apache.sysds.runtime.compress.colgroup.offset.AOffset.OffsetSliceInfo;
import org.apache.sysds.runtime.compress.colgroup.offset.OffsetFactory;
import org.junit.Test;

public class CustomOffsetTest {

    @Test
    public void sliceE() {
        AOffset a = OffsetFactory.createOffset(new int[] {441, 1299, 14612, 16110, 18033, 18643, 18768, 25798, 32315});

        OffsetSliceInfo i = a.slice(1000, 2000);
        System.out.println(a);
        assertEquals(OffsetFactory.createOffset(new int[] {299}), i.offsetSlice);
    }
}
