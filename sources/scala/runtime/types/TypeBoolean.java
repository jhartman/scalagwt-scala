/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003, LAMP/EPFL                  **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

package scala.runtime.types;

import scala.runtime.RunTime;
import scala.Type;
import scala.Array;
import scala.Boolean;

public class TypeBoolean extends BasicType {
    private final Boolean ZERO = RunTime.box_zvalue(false);
    public Array newArray(int size) {
        return RunTime.box_zarray(new boolean[size]);
    }
    public Object defaultValue() { return ZERO; }
};
