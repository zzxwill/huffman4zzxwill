/*
 * $Id: RequestSettingViewPreparer.java 637434 2008-03-15 15:48:38Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.realestate.tiles;

import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.AttributeContext;

/**
 * ATESTZZX simple test <code>ViewPreparer</code> to put a request attribute, that
 * will be used with the EL evaluator.
 *
 * @version $Rev: 637434 $ $Date: 2008-03-15 16:48:38 +0100 (Sat, 15 Mar 2008) $
 */
public class RequestSettingViewPreparer implements ViewPreparer {

    /** {@inheritDoc} */
    public void execute(TilesRequestContext tilesContext,
            AttributeContext attributeContext) {
        tilesContext.getRequestScope().put("body", "test.inner.definition");
        tilesContext.getRequestScope().put("layout", "/layout.jsp");
    }
}
