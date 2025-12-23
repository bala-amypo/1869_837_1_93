@RestController
@RequestMapping("/api/evaluate")
@Tag(name = "Evaluation")
public class EvaluationController {

    private final InteractionService interactionService;

    public EvaluationController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping
    @Operation(summary = "Evaluate drug interactions")
    public ResponseEntity<?> evaluate(
            @RequestBody InteractionEvaluateRequest req) {

        if (req.isRunAsync()) {
            return ResponseEntity.accepted()
                    .body(Map.of("jobId", "ASYNC_NOT_IMPLEMENTED"));
        }

        return ResponseEntity.ok(
                interactionService.evaluate(req.getDrugCodes())
        );
    }
}
