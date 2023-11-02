//
//  ToggleCameraIos.m
//  JitsiMeetSDK
//
//  Created by Sultan Murat Fettahoğlu on 2.11.2023.
//  Copyright © 2023 Jitsi. All rights reserved.
//

#import "ToggleCameraIos.h"
#import "ExternalAPI.h"
#import "JitsiMeet+Private.h"
#import "JitsiMeetConferenceOptions+Private.h"
#import "JitsiMeetView+Private.h"
#import "ReactUtils.h"
#import "RNRootView.h"
#import <React/RCTLog.h>

@implementation ToggleCameraIos

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(toggleCamera) {
    RCTLogInfo(@"Bridge Camera Değiştirme Tetiklendi...");
    ExternalAPI *externalAPI = [[JitsiMeet sharedInstance] getExternalAPI];
    [externalAPI toggleCamera];
}

@end
