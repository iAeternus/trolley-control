package com.ricky.trolley.control.trigger.http;

import com.ricky.trolley.control.app.dto.command.*;
import com.ricky.trolley.control.app.service.TrolleyService;
import com.ricky.trolley.control.types.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ricky
 * @version 1.0
 * @date 2024/7/16
 * @className TrolleyController
 * @desc 操控小车相关接口
 */
@Slf4j
@RestController
@RequestMapping("/trolley")
@Api(tags = "操控小车相关接口")
@RequiredArgsConstructor
public class TrolleyController {

    private final TrolleyService trolleyService;

    @PostMapping("/start/advance")
    @ApiOperation("开始前进")
    public Result<Void> startAdvance(@RequestBody StartAdvanceCommand command) {
        log.info("开始前进");
        trolleyService.startAdvance(command);
        return Result.ok();
    }

    @PostMapping("/start/back")
    @ApiOperation("开始后退")
    public Result<Void> startBackOff(@RequestBody StartBackOffCommand command) {
        log.info("开始后退");
        trolleyService.startBackOff(command);
        return Result.ok();
    }

    @PostMapping("/start/left")
    @ApiOperation("开始向左")
    public Result<Void> startLeft(@RequestBody StartLeftCommand command) {
        log.info("开始向左");
        trolleyService.startLeft(command);
        return Result.ok();
    }

    @PostMapping("/start/right")
    @ApiOperation("开始向右")
    public Result<Void> startRight(@RequestBody StartRightCommand command) {
        log.info("开始向右");
        trolleyService.startRight(command);
        return Result.ok();
    }

    @PostMapping("/stop/advance")
    @ApiOperation("停止前进")
    public Result<Void> stopAdvance(@RequestBody StopAdvanceCommand command) {
        log.info("停止前进");
        trolleyService.stopAdvance(command);
        return Result.ok();
    }

    @PostMapping("/stop/back")
    @ApiOperation("停止后退")
    public Result<Void> stopBackOff(@RequestBody StopBackOffCommand command) {
        log.info("停止后退");
        trolleyService.stopBackOff(command);
        return Result.ok();
    }

    @PostMapping("/stop/left")
    @ApiOperation("停止向左")
    public Result<Void> stopLeft(@RequestBody StopLeftCommand command) {
        log.info("停止向左");
        trolleyService.stopLeft(command);
        return Result.ok();
    }

    @PostMapping("/stop/right")
    @ApiOperation("停止前进")
    public Result<Void> stopRight(@RequestBody StopRightCommand command) {
        log.info("停止前进");
        trolleyService.stopRight(command);
        return Result.ok();
    }

}
