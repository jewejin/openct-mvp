package cc.metapro.openct.gradelist;

/*
 *  Copyright 2015 2017 metapro.cc Jeffctor
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

import java.util.List;
import java.util.Map;

import cc.metapro.openct.BaseView;
import cc.metapro.openct.LoginPresenter;
import cc.metapro.openct.data.university.item.GradeInfo;

interface GradeContract {

    interface View extends BaseView<Presenter> {

        void onLoadGrades(List<GradeInfo> infos);

        void showCETDialog();

        void onLoadCETGrade(Map<String, String> resultMap);

    }

    interface Presenter extends LoginPresenter {

        void loadLocalGrades();

        void loadCETGrade(Map<String, String> queryMap);

        void storeGrades();

        void clearGrades();
    }
}
