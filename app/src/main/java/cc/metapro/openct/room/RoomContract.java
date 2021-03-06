package cc.metapro.openct.room;

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

import android.content.Context;

import java.util.List;

import cc.metapro.openct.BasePresenter;
import cc.metapro.openct.BaseView;
import cc.metapro.openct.data.university.item.RoomInfo;

interface RoomContract {
    interface View extends BaseView<Presenter> {

        void showRooms(int week, int day, int time, String place);

    }

    interface Presenter extends BasePresenter {

        List<RoomInfo> getRoomInfos();

        void loadOnlineRoomInfos();

        void loadLocalRoomInfos(Context context);

        void storeRoomInfos(final Context context);

    }
}
