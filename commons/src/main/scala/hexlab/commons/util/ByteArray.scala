/*
 * This file is part of PlayBnS
 *                      <https://github.com/HeXLaB/play.bns>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2013-2014
 *               HeXLaB Team
 *                           All rights reserved
 */

package hexlab.commons.util

/**
 * This class ...
 *
 * @author hex1r0
 */
object ByteArray {
  type ByteArray = Array[Byte]

  def apply(length: Int) = {
    new Array[Byte](length)
  }

  def apply(hex: String) = {
    HexUtil.fromHex(hex)
  }

  // TODO
  //    def apply(bytes: Seq[Int]) = {
  //
  //    }

  def fromHex(hex: String) = {
    HexUtil.fromHex(hex)
  }

  implicit class ByteArrayObjectExt(obj: Array.type) {
    def fromHex(hex: String) = {
      ByteArray.fromHex(hex)
    }
  }

}

