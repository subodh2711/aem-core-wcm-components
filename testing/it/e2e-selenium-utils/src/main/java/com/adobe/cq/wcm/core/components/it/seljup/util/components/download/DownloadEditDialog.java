/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2022 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


package com.adobe.cq.wcm.core.components.it.seljup.util.components.download;

import com.adobe.cq.testing.selenium.pagewidgets.coral.Dialog;
import com.codeborne.selenide.DragAndDropOptions;

import static com.codeborne.selenide.Selenide.$;

public class DownloadEditDialog extends Dialog {

    private static String assetInSidePanel = "coral-card.cq-draggable[data-path=\"%s\"]";
    private static String fileUpload = "coral-fileupload[name='./file']";
    private static final String CSS_SELECTOR = "coral-dialog";

    public DownloadEditDialog() {
        super(CSS_SELECTOR);
    }

    public void uploadAssetFromSidePanel(String assetPath) {
        DragAndDropOptions.DragAndDropTarget target = new DragAndDropOptions.DragAndDropTarget.CssSelector(fileUpload);
        DragAndDropOptions options = new DragAndDropOptions(target, DragAndDropOptions.DragAndDropMethod.ACTIONS);
        $(String.format(assetInSidePanel,assetPath)).dragAndDrop(options);
    }
}
