// Copyright 2015 Eivind Vegsundvåg
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ninja.eivind.hotsreplayuploader.di;

/**
 * Functional interface for objects that need to be initialized before they can accept calls. Used for classes
 * that are not expected to operate before all fields are set.
 */
@FunctionalInterface
public interface Initializable {

    /**
     * Initializes this object after all members have been injected. Called automatically by the IoC context.
     */
    void initialize();
}
