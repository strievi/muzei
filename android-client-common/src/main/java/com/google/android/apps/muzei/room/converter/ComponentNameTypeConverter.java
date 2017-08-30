/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.muzei.room.converter;

import android.arch.persistence.room.TypeConverter;
import android.content.ComponentName;

/**
 * Converts a {@link ComponentName} into and from a persisted value
 */
public class ComponentNameTypeConverter {
    @TypeConverter
    public static ComponentName fromFlattenedString(String flattenedString) {
        return flattenedString == null ? null : ComponentName.unflattenFromString(flattenedString);
    }

    @TypeConverter
    public static String componentNameToFlattenedString(ComponentName componentName) {
        return componentName == null ? null : componentName.flattenToShortString();
    }
}
