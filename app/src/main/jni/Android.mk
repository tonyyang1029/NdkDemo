LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := NdkLib
LOCAL_SRC_FILES =: com_ty_android_ndkdemo_NdkLib.c
include $(BUILD_SHARED_LIBRARY)