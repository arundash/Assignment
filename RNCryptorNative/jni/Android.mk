LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := rncryptor-native
LOCAL_SRC_FILES := rncryptor-native.cpp
include $(BUILD_SHARED_LIBRARY)