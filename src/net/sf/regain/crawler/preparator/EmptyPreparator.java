/*
 * regain - A file search engine providing plenty of formats
 * Copyright (C) 2004  Til Schneider
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: Til Schneider, info@murfman.de
 *
 * CVS information:
 *  $RCSfile$
 *   $Source$
 *     $Date: 2006-04-26 20:58:10 +0200 (Mi, 26 Apr 2006) $
 *   $Author: til132 $
 * $Revision: 217 $
 */
package net.sf.regain.crawler.preparator;

import net.sf.regain.RegainException;
import net.sf.regain.crawler.document.AbstractPreparator;
import net.sf.regain.crawler.document.RawDocument;

import org.apache.regexp.RE;

/**
 * A preparator adding an empty text for all documents.
 *
 * @author Gerhard Olsson
 */
public class EmptyPreparator extends AbstractPreparator {

  /**
   * Creates a new instance of EmptyPreparator.
   */
  public EmptyPreparator() {
    super(new RE(".*", RE.MATCH_CASEINDEPENDENT));
  }


  // overridden
  public void prepare(RawDocument rawDocument) throws RegainException {
    setCleanedContent("");
  }

}
