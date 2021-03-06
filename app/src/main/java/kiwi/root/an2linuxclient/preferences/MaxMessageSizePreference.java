/*
 * Copyright 2017 rootkiwi
 *
 * AN2Linux-client is licensed under GNU General Public License 3.
 *
 * See LICENSE for more details.
 */

package kiwi.root.an2linuxclient.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class MaxMessageSizePreference extends NumberPickerPreference {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 999;
    public static final int DEFAULT_VALUE = 120;

    public MaxMessageSizePreference(Context context, AttributeSet attrs) {
        super(context, attrs, MIN_VALUE, MAX_VALUE, DEFAULT_VALUE);
    }

}
