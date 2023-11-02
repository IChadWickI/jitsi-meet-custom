import { NativeModules, Platform } from 'react-native';

import { IStore } from '../../../app/types';
import { PIP_ENABLED } from '../../../base/flags/constants';
import { getFeatureFlag } from '../../../base/flags/functions';
import { ToggleCamera } from '../../../base/media/actions';


// import Platform from '../../../base/react/Platform.native';

export const TOGGLE_CAMERA_FACING_MODE = 'TOGGLE_CAMERA_FACING_MODE';

/**
 * Enters (or rather initiates entering) picture-in-picture.
 * Helper function to enter PiP mode. This is triggered by user request
 * (either pressing the button in the toolbox or the home button on Android)
 * and this triggers the PiP mode, if it's available and we are in a
 * conference.
 *
 * @public
 * @returns {Function}
 */
export function toggleCameraFacingMode() {

    console.log('toggleCameraFacingMode, toggleCameraFacingMode react girdi.');
    
    return {
        type: TOGGLE_CAMERA_FACING_MODE
    };
}

