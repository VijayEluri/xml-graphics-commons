/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
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
 */

/* $Id$ */

package org.apache.xmlgraphics.java2d.ps;

import java.io.IOException;

/**
 * Interface which the PSGraphics2D class delegates text painting to.
 */
public interface TextHandler {

    /**
     * Draw some text.
     * @param text the text to paint
     * @param x the x-coordinate where the <code>String</code> should be rendered
     * @param y the y-coordinate where the <code>String</code> should be rendered
     * @throws IOException In case of an I/O error
     */
    public void drawString(String text, float x, float y) throws IOException;

    /**
     * Is called by when the "Setup" or "Prolog" of the PostScript document is generated. 
     * Subclasses can do font registration, for example.
     * @throws IOException In case of an I/O error
     */
    public void writeSetup() throws IOException;

    /**
     * Is called by when a "PageSetup" section of the PostScript document is generated. 
     * Subclasses can do some font initialization if necessary.
     * @throws IOException In case of an I/O error
     */
    public void writePageSetup() throws IOException;
    
}
